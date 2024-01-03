package tbclient.GetRecommendForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThreadList extends Message {
    public static final String DEFAULT_PIC = "";
    public static final Long DEFAULT_TID = 0L;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThreadList> {
        public String pic;
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(ThreadList threadList) {
            super(threadList);
            if (threadList == null) {
                return;
            }
            this.tid = threadList.tid;
            this.title = threadList.title;
            this.pic = threadList.pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadList build(boolean z) {
            return new ThreadList(this, z);
        }
    }

    public ThreadList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.pic;
            if (str2 == null) {
                this.pic = "";
                return;
            } else {
                this.pic = str2;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.pic = builder.pic;
    }
}
