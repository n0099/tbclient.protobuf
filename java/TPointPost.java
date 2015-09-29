package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TPointPost extends Message {
    public static final String DEFAULT_POSITION = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_tuiguang;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String position;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long template_id;
    public static final Integer DEFAULT_IS_TUIGUANG = 0;
    public static final Long DEFAULT_TEMPLATE_ID = 0L;

    /* synthetic */ TPointPost(Builder builder, boolean z, TPointPost tPointPost) {
        this(builder, z);
    }

    private TPointPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_tuiguang == null) {
                this.is_tuiguang = DEFAULT_IS_TUIGUANG;
            } else {
                this.is_tuiguang = builder.is_tuiguang;
            }
            if (builder.position == null) {
                this.position = "";
            } else {
                this.position = builder.position;
            }
            if (builder.template_id == null) {
                this.template_id = DEFAULT_TEMPLATE_ID;
                return;
            } else {
                this.template_id = builder.template_id;
                return;
            }
        }
        this.is_tuiguang = builder.is_tuiguang;
        this.position = builder.position;
        this.template_id = builder.template_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TPointPost> {
        public Integer is_tuiguang;
        public String position;
        public Long template_id;

        public Builder() {
        }

        public Builder(TPointPost tPointPost) {
            super(tPointPost);
            if (tPointPost != null) {
                this.is_tuiguang = tPointPost.is_tuiguang;
                this.position = tPointPost.position;
                this.template_id = tPointPost.template_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TPointPost build(boolean z) {
            return new TPointPost(this, z, null);
        }
    }
}
