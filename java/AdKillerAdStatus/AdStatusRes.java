package tbclient.AdKillerAdStatus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AdStatusRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer ad_alive_countdown;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer ad_left_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_AD_LEFT_NUM = 0;
    public static final Integer DEFAULT_AD_ALIVE_COUNTDOWN = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AdStatusRes> {
        public Integer ad_alive_countdown;
        public Integer ad_left_num;
        public Long forum_id;

        public Builder() {
        }

        public Builder(AdStatusRes adStatusRes) {
            super(adStatusRes);
            if (adStatusRes == null) {
                return;
            }
            this.forum_id = adStatusRes.forum_id;
            this.ad_left_num = adStatusRes.ad_left_num;
            this.ad_alive_countdown = adStatusRes.ad_alive_countdown;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdStatusRes build(boolean z) {
            return new AdStatusRes(this, z);
        }
    }

    public AdStatusRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num = builder.ad_left_num;
            if (num == null) {
                this.ad_left_num = DEFAULT_AD_LEFT_NUM;
            } else {
                this.ad_left_num = num;
            }
            Integer num2 = builder.ad_alive_countdown;
            if (num2 == null) {
                this.ad_alive_countdown = DEFAULT_AD_ALIVE_COUNTDOWN;
                return;
            } else {
                this.ad_alive_countdown = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.ad_left_num = builder.ad_left_num;
        this.ad_alive_countdown = builder.ad_alive_countdown;
    }
}
