package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PrivSets extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer friend;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer group;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer like;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer location;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer post;
    public static final Integer DEFAULT_LOCATION = 0;
    public static final Integer DEFAULT_LIKE = 0;
    public static final Integer DEFAULT_GROUP = 0;
    public static final Integer DEFAULT_POST = 0;
    public static final Integer DEFAULT_FRIEND = 0;

    /* synthetic */ PrivSets(Builder builder, boolean z, PrivSets privSets) {
        this(builder, z);
    }

    private PrivSets(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.location == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = builder.location;
            }
            if (builder.like == null) {
                this.like = DEFAULT_LIKE;
            } else {
                this.like = builder.like;
            }
            if (builder.group == null) {
                this.group = DEFAULT_GROUP;
            } else {
                this.group = builder.group;
            }
            if (builder.post == null) {
                this.post = DEFAULT_POST;
            } else {
                this.post = builder.post;
            }
            if (builder.friend == null) {
                this.friend = DEFAULT_FRIEND;
                return;
            } else {
                this.friend = builder.friend;
                return;
            }
        }
        this.location = builder.location;
        this.like = builder.like;
        this.group = builder.group;
        this.post = builder.post;
        this.friend = builder.friend;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PrivSets> {
        public Integer friend;
        public Integer group;
        public Integer like;
        public Integer location;
        public Integer post;

        public Builder() {
        }

        public Builder(PrivSets privSets) {
            super(privSets);
            if (privSets != null) {
                this.location = privSets.location;
                this.like = privSets.like;
                this.group = privSets.group;
                this.post = privSets.post;
                this.friend = privSets.friend;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivSets build(boolean z) {
            return new PrivSets(this, z, null);
        }
    }
}
