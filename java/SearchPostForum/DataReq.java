package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1342common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1343common;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1343common = dataReq.f1342common;
            this.word = dataReq.word;
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
            this.f1342common = builder.f1343common;
            String str = builder.word;
            if (str == null) {
                this.word = "";
                return;
            } else {
                this.word = str;
                return;
            }
        }
        this.f1342common = builder.f1343common;
        this.word = builder.word;
    }
}
