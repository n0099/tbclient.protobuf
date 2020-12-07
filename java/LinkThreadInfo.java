package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes22.dex */
public final class LinkThreadInfo extends Message {
    public static final List<LinkThreadContent> DEFAULT_LINK_CONTENT = Collections.emptyList();
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_LINK_URL_CODE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<LinkThreadContent> link_content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link_url_code;

    private LinkThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.link_url == null) {
                this.link_url = "";
            } else {
                this.link_url = builder.link_url;
            }
            if (builder.link_url_code == null) {
                this.link_url_code = "";
            } else {
                this.link_url_code = builder.link_url_code;
            }
            if (builder.link_content == null) {
                this.link_content = DEFAULT_LINK_CONTENT;
                return;
            } else {
                this.link_content = immutableCopyOf(builder.link_content);
                return;
            }
        }
        this.link_url = builder.link_url;
        this.link_url_code = builder.link_url_code;
        this.link_content = immutableCopyOf(builder.link_content);
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<LinkThreadInfo> {
        public List<LinkThreadContent> link_content;
        public String link_url;
        public String link_url_code;

        public Builder() {
        }

        public Builder(LinkThreadInfo linkThreadInfo) {
            super(linkThreadInfo);
            if (linkThreadInfo != null) {
                this.link_url = linkThreadInfo.link_url;
                this.link_url_code = linkThreadInfo.link_url_code;
                this.link_content = LinkThreadInfo.copyOf(linkThreadInfo.link_content);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkThreadInfo build(boolean z) {
            return new LinkThreadInfo(this, z);
        }
    }
}
