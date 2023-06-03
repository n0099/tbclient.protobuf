package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (linkThreadContent == null) {
                return;
            }
            this.link_type = linkThreadContent.link_type;
            this.link_title = linkThreadContent.link_title;
            this.link_abstract = linkThreadContent.link_abstract;
            this.link_head_pic = linkThreadContent.link_head_pic;
            this.link_head_small_pic = linkThreadContent.link_head_small_pic;
            this.link_head_big_pic = linkThreadContent.link_head_big_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkThreadContent build(boolean z) {
            return new LinkThreadContent(this, z);
        }
    }

    public LinkThreadContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.link_type;
            if (num == null) {
                this.link_type = DEFAULT_LINK_TYPE;
            } else {
                this.link_type = num;
            }
            String str = builder.link_title;
            if (str == null) {
                this.link_title = "";
            } else {
                this.link_title = str;
            }
            String str2 = builder.link_abstract;
            if (str2 == null) {
                this.link_abstract = "";
            } else {
                this.link_abstract = str2;
            }
            String str3 = builder.link_head_pic;
            if (str3 == null) {
                this.link_head_pic = "";
            } else {
                this.link_head_pic = str3;
            }
            String str4 = builder.link_head_small_pic;
            if (str4 == null) {
                this.link_head_small_pic = "";
            } else {
                this.link_head_small_pic = str4;
            }
            String str5 = builder.link_head_big_pic;
            if (str5 == null) {
                this.link_head_big_pic = "";
                return;
            } else {
                this.link_head_big_pic = str5;
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
}
