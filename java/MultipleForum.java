package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class MultipleForum extends Message {
    public static final String DEFAULT_BAWU_TYPE = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bawu_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_bawu;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_deleted;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_BAWU = 0;
    public static final Integer DEFAULT_IS_DELETED = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<MultipleForum> {
        public String bawu_type;
        public Long forum_id;
        public String forum_name;
        public Integer is_bawu;
        public Integer is_deleted;

        public Builder() {
        }

        public Builder(MultipleForum multipleForum) {
            super(multipleForum);
            if (multipleForum == null) {
                return;
            }
            this.forum_id = multipleForum.forum_id;
            this.forum_name = multipleForum.forum_name;
            this.is_bawu = multipleForum.is_bawu;
            this.bawu_type = multipleForum.bawu_type;
            this.is_deleted = multipleForum.is_deleted;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MultipleForum build(boolean z) {
            return new MultipleForum(this, z);
        }
    }

    public MultipleForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            Integer num = builder.is_bawu;
            if (num == null) {
                this.is_bawu = DEFAULT_IS_BAWU;
            } else {
                this.is_bawu = num;
            }
            String str2 = builder.bawu_type;
            if (str2 == null) {
                this.bawu_type = "";
            } else {
                this.bawu_type = str2;
            }
            Integer num2 = builder.is_deleted;
            if (num2 == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
                return;
            } else {
                this.is_deleted = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.is_bawu = builder.is_bawu;
        this.bawu_type = builder.bawu_type;
        this.is_deleted = builder.is_deleted;
    }
}
