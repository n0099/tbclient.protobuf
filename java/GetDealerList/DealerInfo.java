package tbclient.GetDealerList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DealerInfo extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long score;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_SCORE = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DealerInfo> {
        public String name;
        public String portrait;
        public Long score;
        public Long user_id;

        public Builder() {
        }

        public Builder(DealerInfo dealerInfo) {
            super(dealerInfo);
            if (dealerInfo == null) {
                return;
            }
            this.user_id = dealerInfo.user_id;
            this.name = dealerInfo.name;
            this.portrait = dealerInfo.portrait;
            this.score = dealerInfo.score;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DealerInfo build(boolean z) {
            return new DealerInfo(this, z);
        }
    }

    public DealerInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Long l2 = builder.score;
            if (l2 == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = l2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.name = builder.name;
        this.portrait = builder.portrait;
        this.score = builder.score;
    }
}
