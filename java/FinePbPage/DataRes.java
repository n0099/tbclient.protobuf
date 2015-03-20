package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long nextftid;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long prevftid;
    @ProtoField(tag = 2)
    public final ForumInfo thread_info;
    @ProtoField(tag = 1)
    public final User_Info user_info;
    public static final Long DEFAULT_PREVFTID = 0L;
    public static final Long DEFAULT_NEXTFTID = 0L;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            this.thread_info = builder.thread_info;
            if (builder.prevftid == null) {
                this.prevftid = DEFAULT_PREVFTID;
            } else {
                this.prevftid = builder.prevftid;
            }
            if (builder.nextftid == null) {
                this.nextftid = DEFAULT_NEXTFTID;
                return;
            } else {
                this.nextftid = builder.nextftid;
                return;
            }
        }
        this.user_info = builder.user_info;
        this.thread_info = builder.thread_info;
        this.prevftid = builder.prevftid;
        this.nextftid = builder.nextftid;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public Long nextftid;
        public Long prevftid;
        public ForumInfo thread_info;
        public User_Info user_info;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user_info = dataRes.user_info;
                this.thread_info = dataRes.thread_info;
                this.prevftid = dataRes.prevftid;
                this.nextftid = dataRes.nextftid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
