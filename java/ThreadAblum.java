package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThreadAblum extends Message {
    public static final Integer DEFAULT_ID = 0;
    public static final Long DEFAULT_TAB_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tab_id;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThreadAblum> {
        public Integer id;
        public Long tab_id;

        public Builder() {
        }

        public Builder(ThreadAblum threadAblum) {
            super(threadAblum);
            if (threadAblum == null) {
                return;
            }
            this.id = threadAblum.id;
            this.tab_id = threadAblum.tab_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadAblum build(boolean z) {
            return new ThreadAblum(this, z);
        }
    }

    public ThreadAblum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Long l = builder.tab_id;
            if (l == null) {
                this.tab_id = DEFAULT_TAB_ID;
                return;
            } else {
                this.tab_id = l;
                return;
            }
        }
        this.id = builder.id;
        this.tab_id = builder.tab_id;
    }
}
