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
/* loaded from: classes10.dex */
public final class TogetherHi extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ALBUM_ID;
    public static final String DEFAULT_ALBUM_NAME = "";
    public static final Integer DEFAULT_END_TIME;
    public static final String DEFAULT_LOCATION = "";
    public static final Integer DEFAULT_NUM_JOIN;
    public static final Integer DEFAULT_NUM_SIGNUP;
    public static final List<String> DEFAULT_PIC_URLS;
    public static final List<String> DEFAULT_POTRAITS;
    public static final Integer DEFAULT_START_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String album_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer num_join;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num_signup;
    @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
    public final List<String> pic_urls;
    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> potraits;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer start_time;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<TogetherHi> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long album_id;
        public String album_name;
        public Integer end_time;
        public String location;
        public Integer num_join;
        public Integer num_signup;
        public List<String> pic_urls;
        public List<String> potraits;
        public Integer start_time;

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
        public Builder(TogetherHi togetherHi) {
            super(togetherHi);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {togetherHi};
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
            if (togetherHi == null) {
                return;
            }
            this.album_name = togetherHi.album_name;
            this.album_id = togetherHi.album_id;
            this.start_time = togetherHi.start_time;
            this.end_time = togetherHi.end_time;
            this.location = togetherHi.location;
            this.num_signup = togetherHi.num_signup;
            this.potraits = Message.copyOf(togetherHi.potraits);
            this.num_join = togetherHi.num_join;
            this.pic_urls = Message.copyOf(togetherHi.pic_urls);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TogetherHi build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TogetherHi(this, z, null) : (TogetherHi) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(378177430, "Ltbclient/TogetherHi;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(378177430, "Ltbclient/TogetherHi;");
                return;
            }
        }
        DEFAULT_ALBUM_ID = 0L;
        DEFAULT_START_TIME = 0;
        DEFAULT_END_TIME = 0;
        DEFAULT_NUM_SIGNUP = 0;
        DEFAULT_POTRAITS = Collections.emptyList();
        DEFAULT_NUM_JOIN = 0;
        DEFAULT_PIC_URLS = Collections.emptyList();
    }

    public /* synthetic */ TogetherHi(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherHi(Builder builder, boolean z) {
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
            String str = builder.album_name;
            if (str == null) {
                this.album_name = "";
            } else {
                this.album_name = str;
            }
            Long l = builder.album_id;
            if (l == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = l;
            }
            Integer num = builder.start_time;
            if (num == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num;
            }
            Integer num2 = builder.end_time;
            if (num2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num2;
            }
            String str2 = builder.location;
            if (str2 == null) {
                this.location = "";
            } else {
                this.location = str2;
            }
            Integer num3 = builder.num_signup;
            if (num3 == null) {
                this.num_signup = DEFAULT_NUM_SIGNUP;
            } else {
                this.num_signup = num3;
            }
            List<String> list = builder.potraits;
            if (list == null) {
                this.potraits = DEFAULT_POTRAITS;
            } else {
                this.potraits = Message.immutableCopyOf(list);
            }
            Integer num4 = builder.num_join;
            if (num4 == null) {
                this.num_join = DEFAULT_NUM_JOIN;
            } else {
                this.num_join = num4;
            }
            List<String> list2 = builder.pic_urls;
            if (list2 == null) {
                this.pic_urls = DEFAULT_PIC_URLS;
                return;
            } else {
                this.pic_urls = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.album_name = builder.album_name;
        this.album_id = builder.album_id;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.location = builder.location;
        this.num_signup = builder.num_signup;
        this.potraits = Message.immutableCopyOf(builder.potraits);
        this.num_join = builder.num_join;
        this.pic_urls = Message.immutableCopyOf(builder.pic_urls);
    }
}
