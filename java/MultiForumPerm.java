package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class MultiForumPerm extends Message {
    public static final String DEFAULT_BAWU_TYPE = "";
    public static final Integer DEFAULT_IS_BAWU = 0;
    public static final Integer DEFAULT_IS_DELETED = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bawu_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_bawu;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_deleted;

    private MultiForumPerm(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_bawu == null) {
                this.is_bawu = DEFAULT_IS_BAWU;
            } else {
                this.is_bawu = builder.is_bawu;
            }
            if (builder.bawu_type == null) {
                this.bawu_type = "";
            } else {
                this.bawu_type = builder.bawu_type;
            }
            if (builder.is_deleted == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
                return;
            } else {
                this.is_deleted = builder.is_deleted;
                return;
            }
        }
        this.is_bawu = builder.is_bawu;
        this.bawu_type = builder.bawu_type;
        this.is_deleted = builder.is_deleted;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<MultiForumPerm> {
        public String bawu_type;
        public Integer is_bawu;
        public Integer is_deleted;

        public Builder() {
        }

        public Builder(MultiForumPerm multiForumPerm) {
            super(multiForumPerm);
            if (multiForumPerm != null) {
                this.is_bawu = multiForumPerm.is_bawu;
                this.bawu_type = multiForumPerm.bawu_type;
                this.is_deleted = multiForumPerm.is_deleted;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MultiForumPerm build(boolean z) {
            return new MultiForumPerm(this, z);
        }
    }
}
