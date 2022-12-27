package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_RECOM_THREAD_INFO = Collections.emptyList();
    public static final Integer DEFAULT_REC_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rec_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> recom_thread_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer rec_type;
        public List<ThreadInfo> recom_thread_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recom_thread_info = Message.copyOf(dataRes.recom_thread_info);
            this.rec_type = dataRes.rec_type;
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
            List<ThreadInfo> list = builder.recom_thread_info;
            if (list == null) {
                this.recom_thread_info = DEFAULT_RECOM_THREAD_INFO;
            } else {
                this.recom_thread_info = Message.immutableCopyOf(list);
            }
            Integer num = builder.rec_type;
            if (num == null) {
                this.rec_type = DEFAULT_REC_TYPE;
                return;
            } else {
                this.rec_type = num;
                return;
            }
        }
        this.recom_thread_info = Message.immutableCopyOf(builder.recom_thread_info);
        this.rec_type = builder.rec_type;
    }
}
