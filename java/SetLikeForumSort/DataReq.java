package tbclient.SetLikeForumSort;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_NEW_LIKE_LIST = "";
    public static final String DEFAULT_ORIGINAL_LIKE_LIST = "";
    public static final String DEFAULT_TBS = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1480common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String new_like_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String original_like_list;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tbs;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1481common;
        public String new_like_list;
        public String original_like_list;
        public String tbs;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1481common = dataReq.f1480common;
            this.original_like_list = dataReq.original_like_list;
            this.new_like_list = dataReq.new_like_list;
            this.tbs = dataReq.tbs;
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
            this.f1480common = builder.f1481common;
            String str = builder.original_like_list;
            if (str == null) {
                this.original_like_list = "";
            } else {
                this.original_like_list = str;
            }
            String str2 = builder.new_like_list;
            if (str2 == null) {
                this.new_like_list = "";
            } else {
                this.new_like_list = str2;
            }
            String str3 = builder.tbs;
            if (str3 == null) {
                this.tbs = "";
                return;
            } else {
                this.tbs = str3;
                return;
            }
        }
        this.f1480common = builder.f1481common;
        this.original_like_list = builder.original_like_list;
        this.new_like_list = builder.new_like_list;
        this.tbs = builder.tbs;
    }
}
