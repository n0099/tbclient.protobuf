package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ActHot extends Message {
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_IMG_DES = "";
    public static final String DEFAULT_IMG_SRC = "";
    public static final Integer DEFAULT_IMG_TYPE = 0;
    public static final String DEFAULT_LINK = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String img_des;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_src;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer img_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ActHot> {
        public String author_name;
        public String bsize;
        public String img_des;
        public String img_src;
        public Integer img_type;
        public String link;

        public Builder() {
        }

        public Builder(ActHot actHot) {
            super(actHot);
            if (actHot == null) {
                return;
            }
            this.bsize = actHot.bsize;
            this.img_src = actHot.img_src;
            this.link = actHot.link;
            this.author_name = actHot.author_name;
            this.img_des = actHot.img_des;
            this.img_type = actHot.img_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActHot build(boolean z) {
            return new ActHot(this, z);
        }
    }

    public ActHot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.bsize;
            if (str == null) {
                this.bsize = "";
            } else {
                this.bsize = str;
            }
            String str2 = builder.img_src;
            if (str2 == null) {
                this.img_src = "";
            } else {
                this.img_src = str2;
            }
            String str3 = builder.link;
            if (str3 == null) {
                this.link = "";
            } else {
                this.link = str3;
            }
            String str4 = builder.author_name;
            if (str4 == null) {
                this.author_name = "";
            } else {
                this.author_name = str4;
            }
            String str5 = builder.img_des;
            if (str5 == null) {
                this.img_des = "";
            } else {
                this.img_des = str5;
            }
            Integer num = builder.img_type;
            if (num == null) {
                this.img_type = DEFAULT_IMG_TYPE;
                return;
            } else {
                this.img_type = num;
                return;
            }
        }
        this.bsize = builder.bsize;
        this.img_src = builder.img_src;
        this.link = builder.link;
        this.author_name = builder.author_name;
        this.img_des = builder.img_des;
        this.img_type = builder.img_type;
    }
}
