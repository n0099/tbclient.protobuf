package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FeedHeadFigure extends Message {
    public static final String DEFAULT_BG_TYPE = "";
    public static final String DEFAULT_BG_VALUE = "";
    public static final String DEFAULT_CORNER_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bg_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bg_value;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String corner_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedHeadFigure> {
        public String bg_type;
        public String bg_value;
        public String corner_url;
        public String img_url;

        public Builder() {
        }

        public Builder(FeedHeadFigure feedHeadFigure) {
            super(feedHeadFigure);
            if (feedHeadFigure == null) {
                return;
            }
            this.img_url = feedHeadFigure.img_url;
            this.bg_type = feedHeadFigure.bg_type;
            this.bg_value = feedHeadFigure.bg_value;
            this.corner_url = feedHeadFigure.corner_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadFigure build(boolean z) {
            return new FeedHeadFigure(this, z);
        }
    }

    public FeedHeadFigure(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.bg_type;
            if (str2 == null) {
                this.bg_type = "";
            } else {
                this.bg_type = str2;
            }
            String str3 = builder.bg_value;
            if (str3 == null) {
                this.bg_value = "";
            } else {
                this.bg_value = str3;
            }
            String str4 = builder.corner_url;
            if (str4 == null) {
                this.corner_url = "";
                return;
            } else {
                this.corner_url = str4;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.bg_type = builder.bg_type;
        this.bg_value = builder.bg_value;
        this.corner_url = builder.corner_url;
    }
}
