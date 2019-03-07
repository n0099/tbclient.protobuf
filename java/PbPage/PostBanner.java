package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class PostBanner extends Message {
    public static final String DEFAULT_BANNER_NAME = "";
    public static final String DEFAULT_BANNER_PIC = "";
    public static final String DEFAULT_BANNER_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String banner_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String banner_pic;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer banner_position;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer client_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer link_type;
    public static final Integer DEFAULT_BANNER_POSITION = 0;
    public static final Integer DEFAULT_LINK_TYPE = 0;
    public static final Integer DEFAULT_CLIENT_TYPE = 0;

    private PostBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.banner_pic == null) {
                this.banner_pic = "";
            } else {
                this.banner_pic = builder.banner_pic;
            }
            if (builder.banner_name == null) {
                this.banner_name = "";
            } else {
                this.banner_name = builder.banner_name;
            }
            if (builder.banner_position == null) {
                this.banner_position = DEFAULT_BANNER_POSITION;
            } else {
                this.banner_position = builder.banner_position;
            }
            if (builder.link_type == null) {
                this.link_type = DEFAULT_LINK_TYPE;
            } else {
                this.link_type = builder.link_type;
            }
            if (builder.banner_url == null) {
                this.banner_url = "";
            } else {
                this.banner_url = builder.banner_url;
            }
            if (builder.client_type == null) {
                this.client_type = DEFAULT_CLIENT_TYPE;
                return;
            } else {
                this.client_type = builder.client_type;
                return;
            }
        }
        this.banner_pic = builder.banner_pic;
        this.banner_name = builder.banner_name;
        this.banner_position = builder.banner_position;
        this.link_type = builder.link_type;
        this.banner_url = builder.banner_url;
        this.client_type = builder.client_type;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<PostBanner> {
        public String banner_name;
        public String banner_pic;
        public Integer banner_position;
        public String banner_url;
        public Integer client_type;
        public Integer link_type;

        public Builder() {
        }

        public Builder(PostBanner postBanner) {
            super(postBanner);
            if (postBanner != null) {
                this.banner_pic = postBanner.banner_pic;
                this.banner_name = postBanner.banner_name;
                this.banner_position = postBanner.banner_position;
                this.link_type = postBanner.link_type;
                this.banner_url = postBanner.banner_url;
                this.client_type = postBanner.client_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostBanner build(boolean z) {
            return new PostBanner(this, z);
        }
    }
}
