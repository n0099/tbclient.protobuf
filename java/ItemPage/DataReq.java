package tbclient.ItemPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1436common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer item_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_dip;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_ITEM_ID = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_DIP = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1437common;
        public Integer item_id;
        public Integer q_type;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1437common = dataReq.f1436common;
            this.item_id = dataReq.item_id;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1436common = builder.f1437common;
            Integer num = builder.item_id;
            if (num == null) {
                this.item_id = DEFAULT_ITEM_ID;
            } else {
                this.item_id = num;
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Integer num4 = builder.scr_dip;
            if (num4 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = num4;
            }
            Integer num5 = builder.q_type;
            if (num5 == null) {
                this.q_type = DEFAULT_Q_TYPE;
                return;
            } else {
                this.q_type = num5;
                return;
            }
        }
        this.f1436common = builder.f1437common;
        this.item_id = builder.item_id;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
    }
}
