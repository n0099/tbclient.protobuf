package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.App;
/* loaded from: classes7.dex */
public final class AdkillerAd extends Message {
    public static final Integer DEFAULT_CAN_CLOSE = 0;
    public static final String DEFAULT_GAME_URL = "";
    public static final String DEFAULT_TAG = "";
    @ProtoField(tag = 3)
    public final App app;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer can_close;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tag;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AdkillerAd> {
        public App app;
        public Integer can_close;
        public String game_url;
        public String tag;

        public Builder() {
        }

        public Builder(AdkillerAd adkillerAd) {
            super(adkillerAd);
            if (adkillerAd == null) {
                return;
            }
            this.tag = adkillerAd.tag;
            this.game_url = adkillerAd.game_url;
            this.app = adkillerAd.app;
            this.can_close = adkillerAd.can_close;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdkillerAd build(boolean z) {
            return new AdkillerAd(this, z);
        }
    }

    public AdkillerAd(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tag;
            if (str == null) {
                this.tag = "";
            } else {
                this.tag = str;
            }
            String str2 = builder.game_url;
            if (str2 == null) {
                this.game_url = "";
            } else {
                this.game_url = str2;
            }
            this.app = builder.app;
            Integer num = builder.can_close;
            if (num == null) {
                this.can_close = DEFAULT_CAN_CLOSE;
                return;
            } else {
                this.can_close = num;
                return;
            }
        }
        this.tag = builder.tag;
        this.game_url = builder.game_url;
        this.app = builder.app;
        this.can_close = builder.can_close;
    }
}
