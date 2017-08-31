package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class LinkThreadContent extends Message {
    public static final String DEFAULT_LINK_ABSTRACT = "";
    public static final String DEFAULT_LINK_HEAD_BIG_PIC = "";
    public static final String DEFAULT_LINK_HEAD_PIC = "";
    public static final String DEFAULT_LINK_HEAD_SMALL_PIC = "";
    public static final String DEFAULT_LINK_TITLE = "";
    public static final Integer DEFAULT_LINK_TYPE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link_abstract;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String link_head_big_pic;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_head_pic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_head_small_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link_title;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer link_type;

    private LinkThreadContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.link_type == null) {
                this.link_type = DEFAULT_LINK_TYPE;
            } else {
                this.link_type = builder.link_type;
            }
            if (builder.link_title == null) {
                this.link_title = "";
            } else {
                this.link_title = builder.link_title;
            }
            if (builder.link_abstract == null) {
                this.link_abstract = "";
            } else {
                this.link_abstract = builder.link_abstract;
            }
            if (builder.link_head_pic == null) {
                this.link_head_pic = "";
            } else {
                this.link_head_pic = builder.link_head_pic;
            }
            if (builder.link_head_small_pic == null) {
                this.link_head_small_pic = "";
            } else {
                this.link_head_small_pic = builder.link_head_small_pic;
            }
            if (builder.link_head_big_pic == null) {
                this.link_head_big_pic = "";
                return;
            } else {
                this.link_head_big_pic = builder.link_head_big_pic;
                return;
            }
        }
        this.link_type = builder.link_type;
        this.link_title = builder.link_title;
        this.link_abstract = builder.link_abstract;
        this.link_head_pic = builder.link_head_pic;
        this.link_head_small_pic = builder.link_head_small_pic;
        this.link_head_big_pic = builder.link_head_big_pic;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<LinkThreadContent> {
        public String link_abstract;
        public String link_head_big_pic;
        public String link_head_pic;
        public String link_head_small_pic;
        public String link_title;
        public Integer link_type;

        public Builder() {
        }

        public Builder(LinkThreadContent linkThreadContent) {
            super(linkThreadContent);
            if (linkThreadContent != null) {
                this.link_type = linkThreadContent.link_type;
                this.link_title = linkThreadContent.link_title;
                this.link_abstract = linkThreadContent.link_abstract;
                this.link_head_pic = linkThreadContent.link_head_pic;
                this.link_head_small_pic = linkThreadContent.link_head_small_pic;
                this.link_head_big_pic = linkThreadContent.link_head_big_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkThreadContent build(boolean z) {
            return new LinkThreadContent(this, z);
        }
    }
}