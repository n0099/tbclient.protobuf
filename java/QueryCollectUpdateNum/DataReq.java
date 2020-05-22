package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes11.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_COLLECT_MARK = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer collect_mark;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1215common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.collect_mark == null) {
                this.collect_mark = DEFAULT_COLLECT_MARK;
            } else {
                this.collect_mark = builder.collect_mark;
            }
            this.f1215common = builder.f1216common;
            return;
        }
        this.collect_mark = builder.collect_mark;
        this.f1215common = builder.f1216common;
    }

    /* loaded from: classes11.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer collect_mark;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1216common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.collect_mark = dataReq.collect_mark;
                this.f1216common = dataReq.f1215common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
