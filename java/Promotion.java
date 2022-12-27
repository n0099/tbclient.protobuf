package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Promotion extends Message {
    public static final Long DEFAULT_APPEAR_TIME = 0L;
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_LINK_TEXT = "";
    public static final String DEFAULT_SUB_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long appear_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Promotion> {
        public Long appear_time;
        public String image;
        public String link;
        public String link_text;
        public String sub_title;
        public String title;

        public Builder() {
        }

        public Builder(Promotion promotion) {
            super(promotion);
            if (promotion == null) {
                return;
            }
            this.title = promotion.title;
            this.sub_title = promotion.sub_title;
            this.image = promotion.image;
            this.link = promotion.link;
            this.link_text = promotion.link_text;
            this.appear_time = promotion.appear_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Promotion build(boolean z) {
            return new Promotion(this, z);
        }
    }

    public Promotion(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.sub_title;
            if (str2 == null) {
                this.sub_title = "";
            } else {
                this.sub_title = str2;
            }
            String str3 = builder.image;
            if (str3 == null) {
                this.image = "";
            } else {
                this.image = str3;
            }
            String str4 = builder.link;
            if (str4 == null) {
                this.link = "";
            } else {
                this.link = str4;
            }
            String str5 = builder.link_text;
            if (str5 == null) {
                this.link_text = "";
            } else {
                this.link_text = str5;
            }
            Long l = builder.appear_time;
            if (l == null) {
                this.appear_time = DEFAULT_APPEAR_TIME;
                return;
            } else {
                this.appear_time = l;
                return;
            }
        }
        this.title = builder.title;
        this.sub_title = builder.sub_title;
        this.image = builder.image;
        this.link = builder.link;
        this.link_text = builder.link_text;
        this.appear_time = builder.appear_time;
    }
}
