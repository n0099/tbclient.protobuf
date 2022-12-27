package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class NobilityTdou extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer clear_time;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer expire_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tdou_num;
    public static final Long DEFAULT_TDOU_NUM = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_EXPIRE_TIME = 0;
    public static final Integer DEFAULT_CLEAR_TIME = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NobilityTdou> {
        public Integer clear_time;
        public Integer expire_time;
        public Integer status;
        public Long tdou_num;

        public Builder() {
        }

        public Builder(NobilityTdou nobilityTdou) {
            super(nobilityTdou);
            if (nobilityTdou == null) {
                return;
            }
            this.tdou_num = nobilityTdou.tdou_num;
            this.status = nobilityTdou.status;
            this.expire_time = nobilityTdou.expire_time;
            this.clear_time = nobilityTdou.clear_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NobilityTdou build(boolean z) {
            return new NobilityTdou(this, z);
        }
    }

    public NobilityTdou(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tdou_num;
            if (l == null) {
                this.tdou_num = DEFAULT_TDOU_NUM;
            } else {
                this.tdou_num = l;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.expire_time;
            if (num2 == null) {
                this.expire_time = DEFAULT_EXPIRE_TIME;
            } else {
                this.expire_time = num2;
            }
            Integer num3 = builder.clear_time;
            if (num3 == null) {
                this.clear_time = DEFAULT_CLEAR_TIME;
                return;
            } else {
                this.clear_time = num3;
                return;
            }
        }
        this.tdou_num = builder.tdou_num;
        this.status = builder.status;
        this.expire_time = builder.expire_time;
        this.clear_time = builder.clear_time;
    }
}
