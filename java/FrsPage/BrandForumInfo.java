package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.OriForumInfo;
/* loaded from: classes.dex */
public final class BrandForumInfo extends Message {
    public static final String DEFAULT_BRAND_DESC = "";
    public static final String DEFAULT_JUMP_DESC = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final List<OriForumInfo> DEFAULT_RELATION_FORUM = Collections.emptyList();
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String brand_desc;
    @ProtoField(tag = 2)
    public final HeadImgs head_imgs;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String jump_desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<OriForumInfo> relation_forum;

    private BrandForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.relation_forum == null) {
                this.relation_forum = DEFAULT_RELATION_FORUM;
            } else {
                this.relation_forum = immutableCopyOf(builder.relation_forum);
            }
            this.head_imgs = builder.head_imgs;
            if (builder.brand_desc == null) {
                this.brand_desc = "";
            } else {
                this.brand_desc = builder.brand_desc;
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
            } else {
                this.jump_url = builder.jump_url;
            }
            if (builder.jump_desc == null) {
                this.jump_desc = "";
                return;
            } else {
                this.jump_desc = builder.jump_desc;
                return;
            }
        }
        this.relation_forum = immutableCopyOf(builder.relation_forum);
        this.head_imgs = builder.head_imgs;
        this.brand_desc = builder.brand_desc;
        this.jump_url = builder.jump_url;
        this.jump_desc = builder.jump_desc;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BrandForumInfo> {
        public String brand_desc;
        public HeadImgs head_imgs;
        public String jump_desc;
        public String jump_url;
        public List<OriForumInfo> relation_forum;

        public Builder() {
        }

        public Builder(BrandForumInfo brandForumInfo) {
            super(brandForumInfo);
            if (brandForumInfo != null) {
                this.relation_forum = BrandForumInfo.copyOf(brandForumInfo.relation_forum);
                this.head_imgs = brandForumInfo.head_imgs;
                this.brand_desc = brandForumInfo.brand_desc;
                this.jump_url = brandForumInfo.jump_url;
                this.jump_desc = brandForumInfo.jump_desc;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BrandForumInfo build(boolean z) {
            return new BrandForumInfo(this, z);
        }
    }
}
