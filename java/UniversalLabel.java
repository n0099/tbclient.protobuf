package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UniversalLabel extends Message {
    public static final String DEFAULT_BACKGROUND_COLOR = "";
    public static final String DEFAULT_BACKGROUND_COLOR_BLACK = "";
    public static final String DEFAULT_LABEL_ID = "";
    public static final String DEFAULT_LABEL_TEXT = "";
    public static final Integer DEFAULT_ROUND_RADIUS = 0;
    public static final String DEFAULT_TEXT_COLOR = "";
    public static final String DEFAULT_TEXT_COLOR_BLACK = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String background_color;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String background_color_black;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String label_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String label_text;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer round_radius;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text_color_black;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UniversalLabel> {
        public String background_color;
        public String background_color_black;
        public String label_id;
        public String label_text;
        public Integer round_radius;
        public String text_color;
        public String text_color_black;

        public Builder() {
        }

        public Builder(UniversalLabel universalLabel) {
            super(universalLabel);
            if (universalLabel == null) {
                return;
            }
            this.label_id = universalLabel.label_id;
            this.label_text = universalLabel.label_text;
            this.text_color = universalLabel.text_color;
            this.text_color_black = universalLabel.text_color_black;
            this.background_color = universalLabel.background_color;
            this.background_color_black = universalLabel.background_color_black;
            this.round_radius = universalLabel.round_radius;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UniversalLabel build(boolean z) {
            return new UniversalLabel(this, z);
        }
    }

    public UniversalLabel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.label_id;
            if (str == null) {
                this.label_id = "";
            } else {
                this.label_id = str;
            }
            String str2 = builder.label_text;
            if (str2 == null) {
                this.label_text = "";
            } else {
                this.label_text = str2;
            }
            String str3 = builder.text_color;
            if (str3 == null) {
                this.text_color = "";
            } else {
                this.text_color = str3;
            }
            String str4 = builder.text_color_black;
            if (str4 == null) {
                this.text_color_black = "";
            } else {
                this.text_color_black = str4;
            }
            String str5 = builder.background_color;
            if (str5 == null) {
                this.background_color = "";
            } else {
                this.background_color = str5;
            }
            String str6 = builder.background_color_black;
            if (str6 == null) {
                this.background_color_black = "";
            } else {
                this.background_color_black = str6;
            }
            Integer num = builder.round_radius;
            if (num == null) {
                this.round_radius = DEFAULT_ROUND_RADIUS;
                return;
            } else {
                this.round_radius = num;
                return;
            }
        }
        this.label_id = builder.label_id;
        this.label_text = builder.label_text;
        this.text_color = builder.text_color;
        this.text_color_black = builder.text_color_black;
        this.background_color = builder.background_color;
        this.background_color_black = builder.background_color_black;
        this.round_radius = builder.round_radius;
    }
}
