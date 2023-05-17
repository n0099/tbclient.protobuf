package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class CustomFigure extends Message {
    public static final String DEFAULT_BACKGROUND_TYPE = "";
    public static final String DEFAULT_BACKGROUND_VALUE = "";
    public static final String DEFAULT_DYNAMIC_FIGURE_URL = "";
    public static final String DEFAULT_FIGURE_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String background_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String background_value;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String dynamic_figure_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String figure_url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<CustomFigure> {
        public String background_type;
        public String background_value;
        public String dynamic_figure_url;
        public String figure_url;

        public Builder() {
        }

        public Builder(CustomFigure customFigure) {
            super(customFigure);
            if (customFigure == null) {
                return;
            }
            this.figure_url = customFigure.figure_url;
            this.background_type = customFigure.background_type;
            this.background_value = customFigure.background_value;
            this.dynamic_figure_url = customFigure.dynamic_figure_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CustomFigure build(boolean z) {
            return new CustomFigure(this, z);
        }
    }

    public CustomFigure(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.figure_url;
            if (str == null) {
                this.figure_url = "";
            } else {
                this.figure_url = str;
            }
            String str2 = builder.background_type;
            if (str2 == null) {
                this.background_type = "";
            } else {
                this.background_type = str2;
            }
            String str3 = builder.background_value;
            if (str3 == null) {
                this.background_value = "";
            } else {
                this.background_value = str3;
            }
            String str4 = builder.dynamic_figure_url;
            if (str4 == null) {
                this.dynamic_figure_url = "";
                return;
            } else {
                this.dynamic_figure_url = str4;
                return;
            }
        }
        this.figure_url = builder.figure_url;
        this.background_type = builder.background_type;
        this.background_value = builder.background_value;
        this.dynamic_figure_url = builder.dynamic_figure_url;
    }
}
