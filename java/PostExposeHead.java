package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PostExposeHead extends Message {
    public static final String DEFAULT_CORNER_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String corner_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PostExposeHead> {
        public String corner_url;
        public String img_url;
        public String schema;

        public Builder() {
        }

        public Builder(PostExposeHead postExposeHead) {
            super(postExposeHead);
            if (postExposeHead == null) {
                return;
            }
            this.img_url = postExposeHead.img_url;
            this.corner_url = postExposeHead.corner_url;
            this.schema = postExposeHead.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostExposeHead build(boolean z) {
            return new PostExposeHead(this, z);
        }
    }

    public PostExposeHead(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.corner_url;
            if (str2 == null) {
                this.corner_url = "";
            } else {
                this.corner_url = str2;
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str3;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.corner_url = builder.corner_url;
        this.schema = builder.schema;
    }
}
