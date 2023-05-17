package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
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

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LinkThreadInfo> {
        public List<LinkThreadContent> link_content;
        public String link_url;
        public String link_url_code;

        public Builder() {
        }

        public Builder(LinkThreadInfo linkThreadInfo) {
            super(linkThreadInfo);
            if (linkThreadInfo == null) {
                return;
            }
            this.link_url = linkThreadInfo.link_url;
            this.link_url_code = linkThreadInfo.link_url_code;
            this.link_content = Message.copyOf(linkThreadInfo.link_content);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkThreadInfo build(boolean z) {
            return new LinkThreadInfo(this, z);
        }
    }

    public LinkThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.link_url;
            if (str == null) {
                this.link_url = "";
            } else {
                this.link_url = str;
            }
            String str2 = builder.link_url_code;
            if (str2 == null) {
                this.link_url_code = "";
            } else {
                this.link_url_code = str2;
            }
            List<LinkThreadContent> list = builder.link_content;
            if (list == null) {
                this.link_content = DEFAULT_LINK_CONTENT;
                return;
            } else {
                this.link_content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.link_url = builder.link_url;
        this.link_url_code = builder.link_url_code;
        this.link_content = Message.immutableCopyOf(builder.link_content);
    }
}
