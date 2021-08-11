package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class SubPostList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AUTHOR_ID;
    public static final List<PbContent> DEFAULT_CONTENT;
    public static final Integer DEFAULT_FLOOR;
    public static final Long DEFAULT_ID;
    public static final Integer DEFAULT_IS_AUTHOR_VIEW;
    public static final Integer DEFAULT_IS_FAKE_TOP;
    public static final Integer DEFAULT_IS_GIFTPOST;
    public static final Integer DEFAULT_TIME;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9)
    public final Agree agree;
    @ProtoField(tag = 7)
    public final User author;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PbContent> content;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_author_view;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_fake_top;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_giftpost;
    @ProtoField(tag = 10)
    public final Lbs location;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SubPostList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Agree agree;
        public User author;
        public Long author_id;
        public List<PbContent> content;
        public Integer floor;
        public Long id;
        public Integer is_author_view;
        public Integer is_fake_top;
        public Integer is_giftpost;
        public Lbs location;
        public Integer time;
        public String title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(SubPostList subPostList) {
            super(subPostList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {subPostList};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (subPostList == null) {
                return;
            }
            this.id = subPostList.id;
            this.content = Message.copyOf(subPostList.content);
            this.time = subPostList.time;
            this.author_id = subPostList.author_id;
            this.title = subPostList.title;
            this.floor = subPostList.floor;
            this.author = subPostList.author;
            this.is_giftpost = subPostList.is_giftpost;
            this.agree = subPostList.agree;
            this.location = subPostList.location;
            this.is_fake_top = subPostList.is_fake_top;
            this.is_author_view = subPostList.is_author_view;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubPostList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SubPostList(this, z, null) : (SubPostList) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1754025433, "Ltbclient/SubPostList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1754025433, "Ltbclient/SubPostList;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_TIME = 0;
        DEFAULT_AUTHOR_ID = 0L;
        DEFAULT_FLOOR = 0;
        DEFAULT_IS_GIFTPOST = 0;
        DEFAULT_IS_FAKE_TOP = 0;
        DEFAULT_IS_AUTHOR_VIEW = 0;
    }

    public /* synthetic */ SubPostList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubPostList(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num2 = builder.floor;
            if (num2 == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num2;
            }
            this.author = builder.author;
            Integer num3 = builder.is_giftpost;
            if (num3 == null) {
                this.is_giftpost = DEFAULT_IS_GIFTPOST;
            } else {
                this.is_giftpost = num3;
            }
            this.agree = builder.agree;
            this.location = builder.location;
            Integer num4 = builder.is_fake_top;
            if (num4 == null) {
                this.is_fake_top = DEFAULT_IS_FAKE_TOP;
            } else {
                this.is_fake_top = num4;
            }
            Integer num5 = builder.is_author_view;
            if (num5 == null) {
                this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
                return;
            } else {
                this.is_author_view = num5;
                return;
            }
        }
        this.id = builder.id;
        this.content = Message.immutableCopyOf(builder.content);
        this.time = builder.time;
        this.author_id = builder.author_id;
        this.title = builder.title;
        this.floor = builder.floor;
        this.author = builder.author;
        this.is_giftpost = builder.is_giftpost;
        this.agree = builder.agree;
        this.location = builder.location;
        this.is_fake_top = builder.is_fake_top;
        this.is_author_view = builder.is_author_view;
    }
}
