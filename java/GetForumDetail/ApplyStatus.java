package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ApplyStatus extends Message {
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer fdir_next_apply_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_avatar_applying;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_desc_applying;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_fdir_applying;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer next_avatar_apply_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer next_desc_apply_time;
    public static final Integer DEFAULT_IS_AVATAR_APPLYING = 0;
    public static final Integer DEFAULT_IS_DESC_APPLYING = 0;
    public static final Integer DEFAULT_NEXT_AVATAR_APPLY_TIME = 0;
    public static final Integer DEFAULT_NEXT_DESC_APPLY_TIME = 0;
    public static final Integer DEFAULT_IS_FDIR_APPLYING = 0;
    public static final Integer DEFAULT_FDIR_NEXT_APPLY_TIME = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ApplyStatus> {
        public Integer fdir_next_apply_time;
        public Integer is_avatar_applying;
        public Integer is_desc_applying;
        public Integer is_fdir_applying;
        public Integer next_avatar_apply_time;
        public Integer next_desc_apply_time;

        public Builder() {
        }

        public Builder(ApplyStatus applyStatus) {
            super(applyStatus);
            if (applyStatus == null) {
                return;
            }
            this.is_avatar_applying = applyStatus.is_avatar_applying;
            this.is_desc_applying = applyStatus.is_desc_applying;
            this.next_avatar_apply_time = applyStatus.next_avatar_apply_time;
            this.next_desc_apply_time = applyStatus.next_desc_apply_time;
            this.is_fdir_applying = applyStatus.is_fdir_applying;
            this.fdir_next_apply_time = applyStatus.fdir_next_apply_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ApplyStatus build(boolean z) {
            return new ApplyStatus(this, z);
        }
    }

    public ApplyStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_avatar_applying;
            if (num == null) {
                this.is_avatar_applying = DEFAULT_IS_AVATAR_APPLYING;
            } else {
                this.is_avatar_applying = num;
            }
            Integer num2 = builder.is_desc_applying;
            if (num2 == null) {
                this.is_desc_applying = DEFAULT_IS_DESC_APPLYING;
            } else {
                this.is_desc_applying = num2;
            }
            Integer num3 = builder.next_avatar_apply_time;
            if (num3 == null) {
                this.next_avatar_apply_time = DEFAULT_NEXT_AVATAR_APPLY_TIME;
            } else {
                this.next_avatar_apply_time = num3;
            }
            Integer num4 = builder.next_desc_apply_time;
            if (num4 == null) {
                this.next_desc_apply_time = DEFAULT_NEXT_DESC_APPLY_TIME;
            } else {
                this.next_desc_apply_time = num4;
            }
            Integer num5 = builder.is_fdir_applying;
            if (num5 == null) {
                this.is_fdir_applying = DEFAULT_IS_FDIR_APPLYING;
            } else {
                this.is_fdir_applying = num5;
            }
            Integer num6 = builder.fdir_next_apply_time;
            if (num6 == null) {
                this.fdir_next_apply_time = DEFAULT_FDIR_NEXT_APPLY_TIME;
                return;
            } else {
                this.fdir_next_apply_time = num6;
                return;
            }
        }
        this.is_avatar_applying = builder.is_avatar_applying;
        this.is_desc_applying = builder.is_desc_applying;
        this.next_avatar_apply_time = builder.next_avatar_apply_time;
        this.next_desc_apply_time = builder.next_desc_apply_time;
        this.is_fdir_applying = builder.is_fdir_applying;
        this.fdir_next_apply_time = builder.fdir_next_apply_time;
    }
}
