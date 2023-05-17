package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Badges extends Message {
    public static final Integer DEFAULT_BADGE_ID = 0;
    public static final String DEFAULT_BADGE_URL = "";
    public static final String DEFAULT_WEBVIEW = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer badge_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String badge_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String webview;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Badges> {
        public Integer badge_id;
        public String badge_url;
        public String webview;

        public Builder() {
        }

        public Builder(Badges badges) {
            super(badges);
            if (badges == null) {
                return;
            }
            this.badge_id = badges.badge_id;
            this.badge_url = badges.badge_url;
            this.webview = badges.webview;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Badges build(boolean z) {
            return new Badges(this, z);
        }
    }

    public Badges(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.badge_id;
            if (num == null) {
                this.badge_id = DEFAULT_BADGE_ID;
            } else {
                this.badge_id = num;
            }
            String str = builder.badge_url;
            if (str == null) {
                this.badge_url = "";
            } else {
                this.badge_url = str;
            }
            String str2 = builder.webview;
            if (str2 == null) {
                this.webview = "";
                return;
            } else {
                this.webview = str2;
                return;
            }
        }
        this.badge_id = builder.badge_id;
        this.badge_url = builder.badge_url;
        this.webview = builder.webview;
    }
}
