package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes24.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5116common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5116common = builder.f5117common;
            if (builder.word == null) {
                this.word = "";
                return;
            } else {
                this.word = builder.word;
                return;
            }
        }
        this.f5116common = builder.f5117common;
        this.word = builder.word;
    }

    /* loaded from: classes24.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5117common;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5117common = dataReq.f5116common;
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
