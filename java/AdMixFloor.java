package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AdMixFloor extends Message {
    public static final String DEFAULT_ADVERTISE_ID = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long ad_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer ad_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String advertise_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer floor_num;
    public static final Integer DEFAULT_AD_TYPE = 0;
    public static final Integer DEFAULT_FLOOR_NUM = 0;
    public static final Long DEFAULT_AD_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AdMixFloor> {
        public Long ad_id;
        public Integer ad_type;
        public String advertise_id;
        public Integer floor_num;

        public Builder() {
        }

        public Builder(AdMixFloor adMixFloor) {
            super(adMixFloor);
            if (adMixFloor == null) {
                return;
            }
            this.ad_type = adMixFloor.ad_type;
            this.floor_num = adMixFloor.floor_num;
            this.ad_id = adMixFloor.ad_id;
            this.advertise_id = adMixFloor.advertise_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdMixFloor build(boolean z) {
            return new AdMixFloor(this, z);
        }
    }

    public AdMixFloor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.ad_type;
            if (num == null) {
                this.ad_type = DEFAULT_AD_TYPE;
            } else {
                this.ad_type = num;
            }
            Integer num2 = builder.floor_num;
            if (num2 == null) {
                this.floor_num = DEFAULT_FLOOR_NUM;
            } else {
                this.floor_num = num2;
            }
            Long l = builder.ad_id;
            if (l == null) {
                this.ad_id = DEFAULT_AD_ID;
            } else {
                this.ad_id = l;
            }
            String str = builder.advertise_id;
            if (str == null) {
                this.advertise_id = "";
                return;
            } else {
                this.advertise_id = str;
                return;
            }
        }
        this.ad_type = builder.ad_type;
        this.floor_num = builder.floor_num;
        this.ad_id = builder.ad_id;
        this.advertise_id = builder.advertise_id;
    }
}
