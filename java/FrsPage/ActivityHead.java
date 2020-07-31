package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class ActivityHead extends Message {
    public static final String DEFAULT_ACTIVITY_TITLE = "";
    public static final Integer DEFAULT_ACTIVITY_TYPE = 0;
    public static final List<HeadImgs> DEFAULT_HEAD_IMGS = Collections.emptyList();
    public static final String DEFAULT_OBJ_ID = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String activity_title;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer activity_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<HeadImgs> head_imgs;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 4)
    public final Size top_size;

    private ActivityHead(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.activity_type == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = builder.activity_type;
            }
            if (builder.activity_title == null) {
                this.activity_title = "";
            } else {
                this.activity_title = builder.activity_title;
            }
            if (builder.head_imgs == null) {
                this.head_imgs = DEFAULT_HEAD_IMGS;
            } else {
                this.head_imgs = immutableCopyOf(builder.head_imgs);
            }
            this.top_size = builder.top_size;
            if (builder.obj_id == null) {
                this.obj_id = "";
                return;
            } else {
                this.obj_id = builder.obj_id;
                return;
            }
        }
        this.activity_type = builder.activity_type;
        this.activity_title = builder.activity_title;
        this.head_imgs = immutableCopyOf(builder.head_imgs);
        this.top_size = builder.top_size;
        this.obj_id = builder.obj_id;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ActivityHead> {
        public String activity_title;
        public Integer activity_type;
        public List<HeadImgs> head_imgs;
        public String obj_id;
        public Size top_size;

        public Builder() {
        }

        public Builder(ActivityHead activityHead) {
            super(activityHead);
            if (activityHead != null) {
                this.activity_type = activityHead.activity_type;
                this.activity_title = activityHead.activity_title;
                this.head_imgs = ActivityHead.copyOf(activityHead.head_imgs);
                this.top_size = activityHead.top_size;
                this.obj_id = activityHead.obj_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityHead build(boolean z) {
            return new ActivityHead(this, z);
        }
    }
}
