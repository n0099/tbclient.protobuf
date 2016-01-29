package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Anti;
import tbclient.TaskInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<DanmuInfo> DEFAULT_DANMU_LIST = Collections.emptyList();
    public static final List<InterviewDetail> DEFAULT_INTERVIEW_LIST = Collections.emptyList();
    @ProtoField(tag = 7)
    public final Anti anti;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<DanmuInfo> danmu_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<InterviewDetail> interview_list;
    @ProtoField(tag = 6)
    public final TaskInfo task_info;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.danmu_list == null) {
                this.danmu_list = DEFAULT_DANMU_LIST;
            } else {
                this.danmu_list = immutableCopyOf(builder.danmu_list);
            }
            if (builder.interview_list == null) {
                this.interview_list = DEFAULT_INTERVIEW_LIST;
            } else {
                this.interview_list = immutableCopyOf(builder.interview_list);
            }
            this.task_info = builder.task_info;
            this.anti = builder.anti;
            return;
        }
        this.danmu_list = immutableCopyOf(builder.danmu_list);
        this.interview_list = immutableCopyOf(builder.interview_list);
        this.task_info = builder.task_info;
        this.anti = builder.anti;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Anti anti;
        public List<DanmuInfo> danmu_list;
        public List<InterviewDetail> interview_list;
        public TaskInfo task_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.danmu_list = DataRes.copyOf(dataRes.danmu_list);
                this.interview_list = DataRes.copyOf(dataRes.interview_list);
                this.task_info = dataRes.task_info;
                this.anti = dataRes.anti;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
