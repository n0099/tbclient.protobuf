package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class AlaCoverLabel extends Message {
    public static final Integer DEFAULT_LABEL_ID = 0;
    public static final String DEFAULT_LABEL_NAME = "";
    public static final String DEFAULT_LABEL_RGB = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer label_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String label_rgb;

    private AlaCoverLabel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.label_id == null) {
                this.label_id = DEFAULT_LABEL_ID;
            } else {
                this.label_id = builder.label_id;
            }
            if (builder.label_name == null) {
                this.label_name = "";
            } else {
                this.label_name = builder.label_name;
            }
            if (builder.label_rgb == null) {
                this.label_rgb = "";
                return;
            } else {
                this.label_rgb = builder.label_rgb;
                return;
            }
        }
        this.label_id = builder.label_id;
        this.label_name = builder.label_name;
        this.label_rgb = builder.label_rgb;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AlaCoverLabel> {
        public Integer label_id;
        public String label_name;
        public String label_rgb;

        public Builder() {
        }

        public Builder(AlaCoverLabel alaCoverLabel) {
            super(alaCoverLabel);
            if (alaCoverLabel != null) {
                this.label_id = alaCoverLabel.label_id;
                this.label_name = alaCoverLabel.label_name;
                this.label_rgb = alaCoverLabel.label_rgb;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaCoverLabel build(boolean z) {
            return new AlaCoverLabel(this, z);
        }
    }
}
