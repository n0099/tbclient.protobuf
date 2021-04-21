package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_COLLECT_MARK = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer collect_mark;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69731common;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer collect_mark;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69732common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.collect_mark = dataReq.collect_mark;
            this.f69732common = dataReq.f69731common;
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
            Integer num = builder.collect_mark;
            if (num == null) {
                this.collect_mark = DEFAULT_COLLECT_MARK;
            } else {
                this.collect_mark = num;
            }
            this.f69731common = builder.f69732common;
            return;
        }
        this.collect_mark = builder.collect_mark;
        this.f69731common = builder.f69732common;
    }
}
