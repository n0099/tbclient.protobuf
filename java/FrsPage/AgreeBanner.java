package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleUser;
/* loaded from: classes.dex */
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

    private AgreeBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.top_agree_user == null) {
                this.top_agree_user = DEFAULT_TOP_AGREE_USER;
                return;
            } else {
                this.top_agree_user = immutableCopyOf(builder.top_agree_user);
                return;
            }
        }
        this.text = builder.text;
        this.icon_url = builder.icon_url;
        this.url = builder.url;
        this.top_agree_user = immutableCopyOf(builder.top_agree_user);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AgreeBanner> {
        public String icon_url;
        public String text;
        public List<SimpleUser> top_agree_user;
        public String url;

        public Builder() {
        }

        public Builder(AgreeBanner agreeBanner) {
            super(agreeBanner);
            if (agreeBanner != null) {
                this.text = agreeBanner.text;
                this.icon_url = agreeBanner.icon_url;
                this.url = agreeBanner.url;
                this.top_agree_user = AgreeBanner.copyOf(agreeBanner.top_agree_user);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgreeBanner build(boolean z) {
            return new AgreeBanner(this, z);
        }
    }
}
