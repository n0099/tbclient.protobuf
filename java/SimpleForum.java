package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SimpleForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_IS_EXISTS = 0;
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_exists;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    /* synthetic */ SimpleForum(Builder builder, boolean z, SimpleForum simpleForum) {
        this(builder, z);
    }

    private SimpleForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.is_exists == null) {
                this.is_exists = DEFAULT_IS_EXISTS;
            } else {
                this.is_exists = builder.is_exists;
            }
            if (builder.avatar == null) {
                this.avatar = "";
                return;
            } else {
                this.avatar = builder.avatar;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.is_exists = builder.is_exists;
        this.avatar = builder.avatar;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<SimpleForum> {
        public String avatar;
        public Long id;
        public Integer is_exists;
        public String name;

        public Builder(SimpleForum simpleForum) {
            super(simpleForum);
            if (simpleForum != null) {
                this.id = simpleForum.id;
                this.name = simpleForum.name;
                this.is_exists = simpleForum.is_exists;
                this.avatar = simpleForum.avatar;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleForum build(boolean z) {
            return new SimpleForum(this, z, null);
        }
    }
}
