package de.effectivetrainings;

import org.apache.wicket.bean.validation.Property;
import org.apache.wicket.bean.validation.PropertyValidator;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;

import java.util.Arrays;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        super(parameters);
        IModel<Trainer> trainerModel = Model.of(new Trainer());
        add(new FeedbackPanel("feedback"));
        Form<Trainer> form = new Form<Trainer>("form", new CompoundPropertyModel<Trainer>(trainerModel));
        form.add(new TextField("name")
                .add(new PropertyValidator(new Property(Trainer.class,"name"))));
        form.add(new TextField("email")
                .add(new PropertyValidator(new Property(Trainer.class,"email"))));
        form.add(new TextField("phone")
                .add(new PropertyValidator(new Property(Trainer.class,"phone"))));
        form.add(new TextField("birthDay")
                .add(new PropertyValidator(new Property(Trainer.class,"birthDay"))));
        form.add(new DropDownChoice<License>("license",
                Arrays.asList(License.values()))
                .add(new PropertyValidator(
                        new Property(Trainer.class,"license"),TrainerGroupSequence.class)));
        add(form);
    }
}
