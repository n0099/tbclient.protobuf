package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14782common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14782common = builder.f14783common;
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
                return;
            } else {
                this.scr_h = builder.scr_h;
                return;
            }
        }
        this.f14782common = builder.f14783common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14783common;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14783common = dataReq.f14782common;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
