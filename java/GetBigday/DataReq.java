package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
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
        this.common = builder.common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
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
