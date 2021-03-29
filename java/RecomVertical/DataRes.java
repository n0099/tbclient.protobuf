package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 4)
    public final ClassInfo class_info;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer need_rechoose;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ThreadPersonalized> thread_personalized;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<ThreadPersonalized> DEFAULT_THREAD_PERSONALIZED = Collections.emptyList();
    public static final Integer DEFAULT_NEED_RECHOOSE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ClassInfo class_info;
        public Integer need_rechoose;
        public List<ThreadInfo> thread_list;
        public List<ThreadPersonalized> thread_personalized;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.thread_personalized = Message.copyOf(dataRes.thread_personalized);
            this.class_info = dataRes.class_info;
            this.need_rechoose = dataRes.need_rechoose;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<ThreadPersonalized> list2 = builder.thread_personalized;
            if (list2 == null) {
                this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
            } else {
                this.thread_personalized = Message.immutableCopyOf(list2);
            }
            this.class_info = builder.class_info;
            Integer num = builder.need_rechoose;
            if (num == null) {
                this.need_rechoose = DEFAULT_NEED_RECHOOSE;
                return;
            } else {
                this.need_rechoose = num;
                return;
            }
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.thread_personalized = Message.immutableCopyOf(builder.thread_personalized);
        this.class_info = builder.class_info;
        this.need_rechoose = builder.need_rechoose;
    }
}
