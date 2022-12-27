package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ImgInfo> img_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PointTaskInfo> task_list;
    @ProtoField(tag = 3)
    public final UserPointInfo user_point_info;
    public static final List<PointTaskInfo> DEFAULT_TASK_LIST = Collections.emptyList();
    public static final List<ImgInfo> DEFAULT_IMG_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ImgInfo> img_list;
        public List<PointTaskInfo> task_list;
        public UserPointInfo user_point_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.task_list = Message.copyOf(dataRes.task_list);
            this.img_list = Message.copyOf(dataRes.img_list);
            this.user_point_info = dataRes.user_point_info;
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
            List<PointTaskInfo> list = builder.task_list;
            if (list == null) {
                this.task_list = DEFAULT_TASK_LIST;
            } else {
                this.task_list = Message.immutableCopyOf(list);
            }
            List<ImgInfo> list2 = builder.img_list;
            if (list2 == null) {
                this.img_list = DEFAULT_IMG_LIST;
            } else {
                this.img_list = Message.immutableCopyOf(list2);
            }
            this.user_point_info = builder.user_point_info;
            return;
        }
        this.task_list = Message.immutableCopyOf(builder.task_list);
        this.img_list = Message.immutableCopyOf(builder.img_list);
        this.user_point_info = builder.user_point_info;
    }
}
