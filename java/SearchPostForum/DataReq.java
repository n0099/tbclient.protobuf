package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes11.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1237common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1237common = builder.f1238common;
            if (builder.word == null) {
                this.word = "";
                return;
            } else {
                this.word = builder.word;
                return;
            }
        }
        this.f1237common = builder.f1238common;
        this.word = builder.word;
    }

    /* loaded from: classes11.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1238common;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1238common = dataReq.f1237common;
                this.word = dataReq.word;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
