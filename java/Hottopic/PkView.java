package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PkView extends Message {
    public static final String DEFAULT_PK_DESC = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_clicked;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pk_desc;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pk_index;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pk_num;
    public static final Long DEFAULT_PK_NUM = 0L;
    public static final Integer DEFAULT_PK_INDEX = 0;
    public static final Integer DEFAULT_HAS_CLICKED = 0;

    /* synthetic */ PkView(Builder builder, boolean z, PkView pkView) {
        this(builder, z);
    }

    private PkView(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pk_desc == null) {
                this.pk_desc = "";
            } else {
                this.pk_desc = builder.pk_desc;
            }
            if (builder.pk_num == null) {
                this.pk_num = DEFAULT_PK_NUM;
            } else {
                this.pk_num = builder.pk_num;
            }
            if (builder.pk_index == null) {
                this.pk_index = DEFAULT_PK_INDEX;
            } else {
                this.pk_index = builder.pk_index;
            }
            if (builder.has_clicked == null) {
                this.has_clicked = DEFAULT_HAS_CLICKED;
                return;
            } else {
                this.has_clicked = builder.has_clicked;
                return;
            }
        }
        this.pk_desc = builder.pk_desc;
        this.pk_num = builder.pk_num;
        this.pk_index = builder.pk_index;
        this.has_clicked = builder.has_clicked;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PkView> {
        public Integer has_clicked;
        public String pk_desc;
        public Integer pk_index;
        public Long pk_num;

        public Builder() {
        }

        public Builder(PkView pkView) {
            super(pkView);
            if (pkView != null) {
                this.pk_desc = pkView.pk_desc;
                this.pk_num = pkView.pk_num;
                this.pk_index = pkView.pk_index;
                this.has_clicked = pkView.has_clicked;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkView build(boolean z) {
            return new PkView(this, z, null);
        }
    }
}
