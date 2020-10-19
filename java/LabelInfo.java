package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class LabelInfo extends Message {
    public static final String DEFAULT_LABELCONTENT = "";
    public static final Integer DEFAULT_LABELHOT = 0;
    public static final String DEFAULT_LABELID = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String labelContent;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer labelHot;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String labelId;

    private LabelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.labelHot == null) {
                this.labelHot = DEFAULT_LABELHOT;
            } else {
                this.labelHot = builder.labelHot;
            }
            if (builder.labelContent == null) {
                this.labelContent = "";
            } else {
                this.labelContent = builder.labelContent;
            }
            if (builder.labelId == null) {
                this.labelId = "";
                return;
            } else {
                this.labelId = builder.labelId;
                return;
            }
        }
        this.labelHot = builder.labelHot;
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<LabelInfo> {
        public String labelContent;
        public Integer labelHot;
        public String labelId;

        public Builder() {
        }

        public Builder(LabelInfo labelInfo) {
            super(labelInfo);
            if (labelInfo != null) {
                this.labelHot = labelInfo.labelHot;
                this.labelContent = labelInfo.labelContent;
                this.labelId = labelInfo.labelId;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LabelInfo build(boolean z) {
            return new LabelInfo(this, z);
        }
    }
}
