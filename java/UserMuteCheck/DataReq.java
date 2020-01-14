package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1208common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer mute_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id_f;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id_t;
    public static final Long DEFAULT_USER_ID_F = 0L;
    public static final Long DEFAULT_USER_ID_T = 0L;
    public static final Integer DEFAULT_MUTE_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1208common = builder.f1209common;
            if (builder.user_id_f == null) {
                this.user_id_f = DEFAULT_USER_ID_F;
            } else {
                this.user_id_f = builder.user_id_f;
            }
            if (builder.user_id_t == null) {
                this.user_id_t = DEFAULT_USER_ID_T;
            } else {
                this.user_id_t = builder.user_id_t;
            }
            if (builder.mute_type == null) {
                this.mute_type = DEFAULT_MUTE_TYPE;
                return;
            } else {
                this.mute_type = builder.mute_type;
                return;
            }
        }
        this.f1208common = builder.f1209common;
        this.user_id_f = builder.user_id_f;
        this.user_id_t = builder.user_id_t;
        this.mute_type = builder.mute_type;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1209common;
        public Integer mute_type;
        public Long user_id_f;
        public Long user_id_t;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1209common = dataReq.f1208common;
                this.user_id_f = dataReq.user_id_f;
                this.user_id_t = dataReq.user_id_t;
                this.mute_type = dataReq.mute_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
