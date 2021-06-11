package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class AutoPayInfo extends Message {
    public static final String DEFAULT_AUTOPAY_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String autopay_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long begin_time;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pay_channel;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_PAY_CHANNEL = 0;
    public static final Long DEFAULT_BEGIN_TIME = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AutoPayInfo> {
        public String autopay_url;
        public Long begin_time;
        public Long create_time;
        public Integer pay_channel;

        public Builder() {
        }

        public Builder(AutoPayInfo autoPayInfo) {
            super(autoPayInfo);
            if (autoPayInfo == null) {
                return;
            }
            this.create_time = autoPayInfo.create_time;
            this.pay_channel = autoPayInfo.pay_channel;
            this.begin_time = autoPayInfo.begin_time;
            this.autopay_url = autoPayInfo.autopay_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AutoPayInfo build(boolean z) {
            return new AutoPayInfo(this, z);
        }
    }

    public AutoPayInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.create_time;
            if (l == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l;
            }
            Integer num = builder.pay_channel;
            if (num == null) {
                this.pay_channel = DEFAULT_PAY_CHANNEL;
            } else {
                this.pay_channel = num;
            }
            Long l2 = builder.begin_time;
            if (l2 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = l2;
            }
            String str = builder.autopay_url;
            if (str == null) {
                this.autopay_url = "";
                return;
            } else {
                this.autopay_url = str;
                return;
            }
        }
        this.create_time = builder.create_time;
        this.pay_channel = builder.pay_channel;
        this.begin_time = builder.begin_time;
        this.autopay_url = builder.autopay_url;
    }
}
