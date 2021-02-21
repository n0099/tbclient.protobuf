package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ActionControl extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_TEXT_COLOR = "";
    public static final String DEFAULT_TEXT_COLOR_PRESSED = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text_color_pressed;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    private ActionControl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.text_color == null) {
                this.text_color = "";
            } else {
                this.text_color = builder.text_color;
            }
            if (builder.text_color_pressed == null) {
                this.text_color_pressed = "";
                return;
            } else {
                this.text_color_pressed = builder.text_color_pressed;
                return;
            }
        }
        this.url = builder.url;
        this.name = builder.name;
        this.text_color = builder.text_color;
        this.text_color_pressed = builder.text_color_pressed;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ActionControl> {
        public String name;
        public String text_color;
        public String text_color_pressed;
        public String url;

        public Builder() {
        }

        public Builder(ActionControl actionControl) {
            super(actionControl);
            if (actionControl != null) {
                this.url = actionControl.url;
                this.name = actionControl.name;
                this.text_color = actionControl.text_color;
                this.text_color_pressed = actionControl.text_color_pressed;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActionControl build(boolean z) {
            return new ActionControl(this, z);
        }
    }

    public static ActionControl parseFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        builder.url = jSONObject.optString("url");
        builder.name = jSONObject.optString("name");
        builder.text_color = jSONObject.optString("text_color");
        builder.text_color_pressed = jSONObject.optString("text_color_pressed");
        return builder.build(false);
    }

    public static JSONObject toJson(ActionControl actionControl) {
        if (actionControl == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", actionControl.url);
            jSONObject.put("name", actionControl.name);
            jSONObject.put("text_color", actionControl.text_color);
            jSONObject.put("text_color_pressed", actionControl.text_color_pressed);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
