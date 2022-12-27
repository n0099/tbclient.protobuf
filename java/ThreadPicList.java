package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ThreadPicList extends Message {
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThreadPicList> {
        public String pic;

        public Builder() {
        }

        public Builder(ThreadPicList threadPicList) {
            super(threadPicList);
            if (threadPicList == null) {
                return;
            }
            this.pic = threadPicList.pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadPicList build(boolean z) {
            return new ThreadPicList(this, z);
        }
    }

    public ThreadPicList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
                return;
            } else {
                this.pic = str;
                return;
            }
        }
        this.pic = builder.pic;
    }
}
