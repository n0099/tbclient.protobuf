package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
/* loaded from: classes3.dex */
public final class LockWindowThreadInfo extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PbContent> content;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer post_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_TID = 0L;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_POST_NUM = 0;

    private LockWindowThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
                return;
            } else {
                this.post_num = builder.post_num;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.content = immutableCopyOf(builder.content);
        this.post_num = builder.post_num;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<LockWindowThreadInfo> {
        public List<PbContent> content;
        public Integer post_num;
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(LockWindowThreadInfo lockWindowThreadInfo) {
            super(lockWindowThreadInfo);
            if (lockWindowThreadInfo != null) {
                this.tid = lockWindowThreadInfo.tid;
                this.title = lockWindowThreadInfo.title;
                this.content = LockWindowThreadInfo.copyOf(lockWindowThreadInfo.content);
                this.post_num = lockWindowThreadInfo.post_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LockWindowThreadInfo build(boolean z) {
            return new LockWindowThreadInfo(this, z);
        }
    }
}
