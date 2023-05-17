package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleUser;
/* loaded from: classes10.dex */
public final class AgreeBanner extends Message {
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_TEXT = "";
    public static final List<SimpleUser> DEFAULT_TOP_AGREE_USER = Collections.emptyList();
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<SimpleUser> top_agree_user;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AgreeBanner> {
        public String icon_url;
        public String text;
        public List<SimpleUser> top_agree_user;
        public String url;

        public Builder() {
        }

        public Builder(AgreeBanner agreeBanner) {
            super(agreeBanner);
            if (agreeBanner == null) {
                return;
            }
            this.text = agreeBanner.text;
            this.icon_url = agreeBanner.icon_url;
            this.url = agreeBanner.url;
            this.top_agree_user = Message.copyOf(agreeBanner.top_agree_user);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgreeBanner build(boolean z) {
            return new AgreeBanner(this, z);
        }
    }

    public AgreeBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            List<SimpleUser> list = builder.top_agree_user;
            if (list == null) {
                this.top_agree_user = DEFAULT_TOP_AGREE_USER;
                return;
            } else {
                this.top_agree_user = Message.immutableCopyOf(list);
                return;
            }
        }
        this.text = builder.text;
        this.icon_url = builder.icon_url;
        this.url = builder.url;
        this.top_agree_user = Message.immutableCopyOf(builder.top_agree_user);
    }
}
